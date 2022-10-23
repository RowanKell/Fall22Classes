public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long count = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i] % clusterSize == 0) {
                count += sizes[i];
            }
            else {
                count += (sizes[i] / clusterSize) * clusterSize;
                count += clusterSize;
            }
        }
        return count;
    }
}