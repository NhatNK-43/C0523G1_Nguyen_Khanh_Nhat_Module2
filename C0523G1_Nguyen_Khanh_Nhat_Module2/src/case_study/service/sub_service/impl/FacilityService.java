package case_study.service.sub_service.impl;

import case_study.common.InputAndCheckFacility;
import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.sub_repository.IFacilityRepository;
import case_study.repository.sub_repository.repository_impl.FacilityRepository;
import case_study.service.sub_service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>(facilityRepository.display());
        if (facilityMap.size() == 0) {
            System.out.println("Empty list!");
        } else {
            for (Facility facility : facilityMap.keySet()) {
                System.out.println(facility + " - Number of uses: " + facilityMap.get(facility));
            }
        }
    }

    @Override
    public void add(String regexId) {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>(facilityRepository.display());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Service ID: ");
        String serviceId = InputAndCheckFacility.checkServiceIdToAdd(regexId, facilityMap);

        System.out.print("Service name: ");
        String serviceName = InputAndCheckFacility.checkName();

        System.out.print("Usable area: ");
        double usableArea = InputAndCheckFacility.checkArea();

        System.out.print("Rental costs: ");
        double rentalCosts = InputAndCheckFacility.checkRentalCosts();

        System.out.print("Number of people: ");
        int numberOfPeople = InputAndCheckFacility.checkNumberOfPeople();

        System.out.print("Rental type: ");
        String rentalType = InputAndCheckFacility.checkName();

        if (serviceId.matches("^SVVL.*")) {
            System.out.print("Room standard: ");
            String roomStandard = InputAndCheckFacility.checkName();

            System.out.print("Pool area: ");
            double poolArea = InputAndCheckFacility.checkArea();

            System.out.print("Number of floor: ");
            int numberOfFloor = InputAndCheckFacility.checkNumberOfFloor();

            Facility villa = new Villa(serviceId, serviceName, usableArea, rentalCosts, numberOfPeople,
                    rentalType, roomStandard, poolArea, numberOfFloor);
            facilityRepository.add(villa);

        } else if (serviceId.matches("^SVHO.*")) {
            System.out.print("Room standard: ");
            String roomStandard = InputAndCheckFacility.checkName();

            System.out.print("Number of floor: ");
            int numberOfFloor = InputAndCheckFacility.checkNumberOfFloor();

            Facility house = new House(serviceId, serviceName, usableArea, rentalCosts, numberOfPeople,
                    rentalType, roomStandard, numberOfFloor);
            facilityRepository.add(house);

        } else {
            System.out.print("Free service included: ");
            String freeServiceIncluded = scanner.nextLine();

            Facility room = new Room(serviceId, serviceName, usableArea, rentalCosts, numberOfPeople,
                    rentalType, freeServiceIncluded);
            facilityRepository.add(room);
        }
    }

    @Override
    public void displayMaintenance() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>(facilityRepository.displayMaintenance());
        if (facilityMap.size() == 0) {
            System.out.println("Empty list!");
        } else {
            for (Facility facility : facilityMap.keySet()) {
                System.out.println(facility + " - Number of uses: " + facilityMap.get(facility));
            }
        }
    }

    @Override
    public void delete() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>(facilityRepository.display());
        System.out.print("Enter service ID you want to remove: ");
        String serviceId = InputAndCheckFacility.checkServiceIdToRemove(facilityMap);
        facilityRepository.delete(serviceId);
    }
}
