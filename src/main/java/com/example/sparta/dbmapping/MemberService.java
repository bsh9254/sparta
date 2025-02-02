package com.example.sparta.dbmapping;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    public MemberService(MemberRepository memberRepository, TeamRepository teamRepository) {
        this.memberRepository = memberRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void createData() {
        Team team = new Team();
        team.setName("Development Team");
        teamRepository.save(team);

        Member member1 = new Member();
        member1.setName("Alice");
        member1.setTeam(team);

        Member member2 = new Member();
        member2.setName("Bob");
        member2.setTeam(team);

        memberRepository.save(member1);
        memberRepository.save(member2);
    }

    @Transactional(readOnly = true)
    public void fetchMembers() {
        List<Member> members = memberRepository.findAll();
        for (Member member : members) {
            System.out.println("Member: " + member.getName() + ", Team: " + member.getTeam().getName());
        }
    }
}
