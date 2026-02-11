import java.util.*;

class jobSequenceProblem {              //problem statement: Given an array of jobs where every job has a deadline and profit associated with it. Each job takes a single unit of time to complete. We need to find the maximum profit and the number of jobs done.
    static class job {                  //class to represent a job with its id, dadeline and profit
        int dadeline;
        int profit;
        int id;

        public job(int i, int d, int p) {       //constructor to initialize the job object with id, dadeline and profit
            id = i;
            dadeline = d;
            profit = p;
        }
    }

    public static void jobCount(int[][] jobInfo) {                      //TC: O(nlogn) + O(n) ~ O(nlogn) SC: O(n)
        ArrayList<job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {                      //itrate over the jobInfo and create job objects and add to the list
            jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));         //jobInfo[i][0] is the dadeline and jobInfo[i][1] is the profit
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);  //sort the jobs in decreasing order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {                 //iterate over the sorted jobs and add the job to the sequence if its dadeline is greater than the current time
            job curr = jobs.get(i);                             //get the current job
            if (curr.dadeline > time) {                     //if the dadeline of the current job is greater than the current time, add the job to the sequence and increment the time
                seq.add(curr.id);                           //add the job id to the sequence
                time++;
            }
        }
        System.out.println(seq);
        System.out.println(time);
    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        jobCount(jobInfo);
    }
}
