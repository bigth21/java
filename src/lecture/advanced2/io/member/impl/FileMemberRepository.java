package lecture.advanced2.io.member.impl;

import lecture.advanced2.io.member.Member;
import lecture.advanced2.io.member.MemberRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FileMemberRepository implements MemberRepository {
    private static final String FILE_NAME = "temp/members-txt.dat";
    private static final String DELIMITER = ",";

    @Override
    public void add(Member member) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, UTF_8, true))) {
            bw.write(member.getId() + DELIMITER + member.getName() + DELIMITER + member.getAge());
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME, UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(DELIMITER);
                members.add(new Member(split[0], split[1], Integer.parseInt(split[2])));
            }
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return members;
    }
}
