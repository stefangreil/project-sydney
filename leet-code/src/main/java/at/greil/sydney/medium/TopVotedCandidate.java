package at.greil.sydney.medium;

import java.util.*;

/**
 * You are given two integer arrays persons and times. In an election, the ith vote was cast for persons[i] at time
 * times[i].
 * For each query at a time t, find the person that was leading the election at time t. Votes cast at time t will
 * count towards our query. In the case of a tie, the most recent vote (among tied candidates) wins.
 * <p>
 * Implement the TopVotedCandidate class:
 * TopVotedCandidate(int[] persons, int[] times) Initializes the object with the persons and times arrays.
 * int q(int t) Returns the number of the person that was leading the election at time t according to the
 * mentioned rules.
 */
class TopVotedCandidate {

    private int[] persons;
    private int[] times;
    private HashMap<Integer, Integer> votes;

    public TopVotedCandidate(int[] persons, int[] times) {
        this.persons = persons;
        this.times = times;

        this.votes = new HashMap<>();
    }

    public int q(int t) {

        int momentIndex = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] <= t) {
                momentIndex = i;
            } else {
                break;
            }
        }

        int[] momentTimes = new int[momentIndex + 1];
        int[] momentPersons = new int[momentIndex + 1];
        for (int i = 0; i <= momentIndex; i++) {
            momentTimes[i] = times[i];
            momentPersons[i] = persons[i];
        }

        votes = new HashMap<>();
        for (int p : momentPersons) {
            if (votes.containsKey(p)) {
                Integer vote = votes.get(p);
                votes.put(p, vote + 1);
            } else {
                votes.put(p, 1);
            }
        }

        int actualKey = 0;
        int voteMax = 0;
        for (int i = 0; i < votes.size(); i++) {
            if(votes.get(i) > voteMax) {
                actualKey = i;
                voteMax = votes.get(i);
            } else if (votes.get(i) == voteMax) {
                for (int j = momentPersons.length-1; j >= 0; j--) {
                    if (momentPersons[j] == i) {
                        actualKey = i;
                        voteMax = votes.get(i);
                        break;
                    }
                    if (momentPersons[j] == actualKey) {
                        break;
                    }
                }
            }
        }
        return actualKey;
    }

}
