package Gym_management_system;

public class Main {
    public static void main(String[] args) {
        GymManager manager = new GymManager(5, 2);

        MembershipPlan monthlyPlan = new MembershipPlan("Monthly Basic", 1, 50.0);
        MembershipPlan yearlyPlan = new MembershipPlan("Yearly Gold", 12, 500.0);
        
        // Testing getDiscount()
        yearlyPlan.getDiscount();

        Member member1 = new Member("M001", "Nithilan S", "9876543210", "nithilan@amrita.edu", monthlyPlan);
        Member member2 = new Member("M002", "Dharun A", "9123456789", "dharun@amrita.edu", yearlyPlan);

        manager.registerMember(member1);
        manager.registerMember(member2);

        Trainer trainer1 = new Trainer("T001", "Sujeeth S", "9000011111", "sujeeth@gym.com", "Bodybuilding", 3000.0);
        trainer1.assignMember(member1);
        trainer1.assignMember(member2);
        
        // Testing getSchedule()
        trainer1.getSchedule();

        System.out.println("\n--- Displaying Profiles ---");
        member1.displayProfile();
        trainer1.displayProfile();

        // Testing checkAccess()
        System.out.println("\n--- Checking Access ---");
        member1.checkAccess();

        System.out.println("\n--- Revenue Report ---");
        // Testing generateRevenueReport()
        manager.generateRevenueReport();

        System.out.println("\n--- Saving & Loading Data ---");
        manager.saveMembersToFile("gym_members.txt");
        manager.loadMembersFromFile("gym_members.txt");
    }
}