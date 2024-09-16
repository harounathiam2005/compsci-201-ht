public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        int count = 0;
        for (int s : sizes) {
            if (s == 0)
                continue;
            if (s <= clusterSize) {
                count += clusterSize;
            }
            else {
                count += clusterSize * Math.round(((double)s / clusterSize));
            }
        }
        return count;
    }
 }
