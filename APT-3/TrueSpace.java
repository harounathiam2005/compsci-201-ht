public class TrueSpace {
    // if file size < cluster size: space used += cluster size
    // if file size > cluster size: 
    //  if file size % cluster size == 0:
    //  space used += cluster size * (file size / cluster size)
    // else:
    //  space used += cluster size * (file size / cluster size) + 1
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
