public class ProblemSet8 {

    public boolean common(int[] a, int[] b) {

        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        } else {
            return (a[a.length - 1] == b[b.length - 1]) || (a[0] == b[0]);
        }

    }

    public int[] middleman(int[] a, int[] b) {

        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 != 1 || b.length % 2 != 1) {
            return null;
        } else {
            return new int[] {a[a.length/2], b[b.length/2]};
        }

    }

    public int[] bigger(int[] a, int[] b) {

        int sum1 = 0;
        int sum2 = 0;

        if (a == null || b == null) {
            return null;
        } else {
            for (int i : a) {
                sum1 += i;
            }
            for (int i : b) {
                sum2 += i;
            }
            if (sum1 >= sum2) {
                return a;
            } else {
                return b;
            }
        }

    }

    public int[] doubleMiddle(int[] a, int[] b) {

        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 != 0 || b.length % 2 != 0) {
            return null;
        } else {
            return new int[] {a[a.length/2-1], a[a.length/2], b[b.length/2-1], b[b.length/2]};
        }

    }

    public int[] swapMe(int[] a) {

        if (a == null) {
            return null;
        } else {
            int n = a[a.length-1];
            a[a.length-1] = a[0];
            a[0] = n;
            return a;
        }

    }

    public int[] threeProng(int[] a) {

        if (a == null || a.length == 0 || a.length % 2 != 1) {
            return null;
        } else {
            int[] answer = new int[] {a[0], a[a.length/2], a[a.length-1]};
            return answer;
        }
    }

    public int headHoncho(int[] a) {

        if (a == null || a.length == 0) {
            return -1;
        } else {
            int largest = 0;
            for (int i : a) {
                if (i < 0) {
                    return -1;
                } else if (i > largest) {
                    largest = i;
                }
            }
            return largest;
        }

    }

    public boolean tippingPoint(int[] a, int threshold) {

        if (a == null) {
            return false;
        } else {
            int array_sum = 0;
            for (int i : a) {
                array_sum += i;
            }
            return array_sum > threshold;
        }

    }

    public static String halfway(int[] a) {

        if (a == null || a.length == 0 || a.length % 2 != 0) {
            return null;
        }
        int left_sum = 0;
        int right_sum = 0;
        for (int m = 0; m < a.length/2; m++) {
            left_sum += a[m];
        }
        for (int n = (a.length/2); n < a.length; n++) {
            right_sum += a[n];
        }
        if (left_sum > right_sum) {
            return "LEFT";
        } else {
            return "RIGHT";
        }

    }

    public int[] sequential(int[] a, int[] b) {

        if (a == null || b == null || (a.length + b.length < 3)) {
            return null;
        } else {
            int[] answer = new int[3];
            int length = a.length;
            int remain = 3-length;
            for (int n = 0; n < length; n++) {
                answer[n] = a[n];
            }
            if (remain > 0) {
                for (int m = 0; m < remain; m++) {
                    answer[m+length] = b[m];
                }
            }
            return answer;
        }
    }
}