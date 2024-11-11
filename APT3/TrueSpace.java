public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long spaceUsed = 0;
        for (int s : sizes) {
            if (s == 0) {
                continue;
            }
            else if (s <= clusterSize) {
                spaceUsed += clusterSize;
            }
            else {
                if (s % clusterSize == 0) {
                    spaceUsed += clusterSize * (s / clusterSize);
                }
                else {
                    spaceUsed += clusterSize * ((s / clusterSize) + 1);
                }
            }
        }
        return spaceUsed;
    }
 }
