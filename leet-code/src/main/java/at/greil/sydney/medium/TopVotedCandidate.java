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
        for (int p : persons) {
            votes.put(p, 0);
        }
    }

    public int q(int t) {
        int voteIndex = 0;

        for (int i = 0; i < times.length; i++) {
            if (t == times[i]) {
                voteIndex = i;
                updateVotes(i);
                break;
            } else if (t < times[i] && (i -1) >= 0) {
                voteIndex = i-1;
                updateVotes(voteIndex);
                break;
            }
        }

        if(t >= times[times.length-1]) {
            voteIndex = persons[persons.length-1];
        }

        int max = Collections.max(votes.values());
        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : votes.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
            }
        }

        if(keys.size() > 1){
            return persons[voteIndex];
        } else {
            return keys.get(0);
        }
    }

    private void updateVotes(int i) {
        Integer actualCount = votes.get(persons[i]) + 1;
        votes.replace(persons[i], actualCount);
    }
}
