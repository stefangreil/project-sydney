package at.greil.sydney.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopVotedCandidateTest {

    @Test
    void example1() {

        int[] persons = {0, 1, 1, 0, 0, 1, 1};
        int[] times = {0, 5, 10, 15, 20, 25, 30};

        TopVotedCandidate topVotedCandidate = new TopVotedCandidate(persons, times);
        assertEquals(0,topVotedCandidate.q(3)); // return 0, At time 3, the votes are [0], and 0 is leading.
        assertEquals(1,topVotedCandidate.q(12)); // return 1, At time 12, the votes are [0,1,1], and 1 is leading.
        assertEquals(1,topVotedCandidate.q(25)); // return 1, At time 25, the votes are [0,1,1,0,0,1], and 1 is leading (as ties go to the most recent vote.)
        assertEquals(0,topVotedCandidate.q(15)); // return 0
        assertEquals(0,topVotedCandidate.q(24)); // return 0
        assertEquals(1,topVotedCandidate.q(8)); // return 1
        assertEquals(1,topVotedCandidate.q(100)); // return 1
    }

}