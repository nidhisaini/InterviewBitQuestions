package stringsQuestions;

/*Merge Overlapping IntervalsBookmark Suggest Edit
Given a collection of intervals, merge all overlapping intervals.

For example:

Given [1,3],[2,6],[8,10],[15,18],

return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}

	public int getStart() {
		return start;
	}

	public int grtEnd() {
		return end;
	}
}

class IntervalComparator implements Comparator<Interval> {

	@Override
	public int compare(Interval o1, Interval o2) {
		int val = o1.getStart() - o2.getStart();
		return val;
	}

}
class mergeIntervals {

	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		ArrayList<Interval> result = new ArrayList<Interval>();

		if (intervals.size() == 0 || intervals.size() == 1)
			return intervals;

		Collections.sort(intervals, new IntervalComparator());

		Interval first = intervals.get(0);
		int start = first.start;
		int end = first.end;

		for (int j = 1; j < intervals.size(); j++) {
			Interval current = intervals.get(j);
			if (current.start <= end) {
				end = Math.max(current.end, end);
			} else {
				result.add(new Interval(start, end));
				start = current.start;
				end = current.end;
			}
		}
		result.add(new Interval(start, end));
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Interval> i = new ArrayList<Interval>();
		
		Interval i1 = new Interval(6, 9);
		Interval i2 = new Interval(1, 3);	
		Interval i3 = new Interval(10, 16);
		Interval i4 = new Interval(15, 18);

		i.add(i1);
		i.add(i2);
		i.add(i3);
		i.add(i4);

		ArrayList<Interval> r = new ArrayList<Interval>();
		r = merge(i);

		for (Interval val : r) {
            System.out.println(val.start + " " + val.end);
        }
	

	}

}

/*http://www.codejava.net/java-core/collections/sorting-list-collections-examples*/