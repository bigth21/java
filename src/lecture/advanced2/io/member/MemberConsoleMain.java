package lecture.advanced2.io.member;

import lecture.advanced2.io.member.impl.DataMemberRepository;
import lecture.advanced2.io.member.impl.ObjectMemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {
    //    private static final MemberRepository repository = new MemoryMemberRepository();
//    private static final MemberRepository repository = new FileMemberRepository();
//    private static final MemberRepository repository = new DataMemberRepository();
    private static final MemberRepository repository = new ObjectMemberRepository();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register | 2. Find Members | 3. Quit");
            System.out.print("Input: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Delete newline
            switch (choice) {
                case 1:
                    registerMember(scanner);
                    break;
                case 2:
                    findMembers();
                    break;
                case 3:
                    System.out.println("Terminated");
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private static void registerMember(Scanner scanner) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Delete newline

        Member member = new Member(id, name, age);
        repository.add(member);

        System.out.println("Member registered");
    }

    private static void findMembers() {
        List<Member> members = repository.findAll();
        System.out.println("Member List");
        for (Member member : members) {
            System.out.printf("[ID: %s, Name: %s, Age: %d]\n", member.getId(), member.getName(), member.getAge());
        }
    }
}
