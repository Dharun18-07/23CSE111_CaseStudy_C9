package Gym_management_system;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        GymManager manager=new GymManager(10,5);

        int choice;

        do{
            System.out.println("\n--- GYM MANAGEMENT SYSTEM ---");
            System.out.println("1.Register Member");
            System.out.println("2.Find Member");
            System.out.println("3.Remove Expired Members");
            System.out.println("4.Revenue Report");
            System.out.println("5.Show All Members");
            System.out.println("6.Show All Trainers");
            System.out.println("7.Save to File");
            System.out.println("8.Load from File");
            System.out.println("9.Exit");
            System.out.println("Enter choice: ");

            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    MembershipPlan plan=null;

                    System.out.println("1.Monthly 2.Quarterly 3.Yearly\n");
                    int p=sc.nextInt();
                    sc.nextLine();

                    if(p==1)plan=new MembershipPlan("Monthly",1,50);
                    else if(p==2)plan=new MembershipPlan("Quarterly",3,120);
                    else if(p==3)plan=new MembershipPlan("Yearly",12,500);
                    else break;

                    System.out.print("ID: ");
                    String id=sc.nextLine();
                    System.out.print("Name: ");
                    String name=sc.nextLine();
                    System.out.print("Phone: ");
                    String phone=sc.nextLine();
                    System.out.print("Email: ");
                    String email=sc.nextLine();

                    Member member=new Member(id,name,phone,email,plan);

                    boolean added=manager.registerMember(member);
                    if(!added)break;

                    System.out.println("Assign Trainer? 1.Yes 2.No");
                    int assign=sc.nextInt();

                    if(assign==1){
                        System.out.println("1.FatLoss 2.Bodybuilding 3.Strength 4.General");
                        int t=sc.nextInt();

                        String spec="";
                        String tid="";

                        if(t==1){spec="FatLoss";tid="T1";}
                        else if(t==2){spec="Bodybuilding";tid="T2";}
                        else if(t==3){spec="Strength";tid="T3";}
                        else if(t==4){spec="General";tid="T4";}
                        else break;

                        Trainer trainer=manager.getOrCreateTrainer(tid,spec+" Trainer","9000000000",spec+"@gym.com",spec,3000);

                        if(trainer!=null){
                            trainer.assignMember(member);
                            trainer.getSchedule();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    manager.findMemberById(sc.nextLine());
                    break;

                case 3:
                    manager.removeExpiredMembers();
                    break;

                case 4:
                    manager.generateRevenueReport();
                    break;

                case 5:
                    manager.showAllMembers();
                    break;

                case 6:
                    manager.showAllTrainers();
                    break;

                case 7:
                    manager.saveMembersToFile("gym_members.txt");
                    break;

                case 8:
                    manager.loadMembersFromFile("gym_members.txt");
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while(choice!=9);

        sc.close();
    }
}