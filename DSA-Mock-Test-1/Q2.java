public class Q2 {
    public static int firstUniqChar(String s) {
        int[] charCounts = new int[26]; // Array to store the count of each character
        
        // Count the occurrences of each character in the string
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }
        
        // Find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1; // Return -1 if there is no unique character
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        int index1 = firstUniqChar(s1);
        System.out.println("First unique character index in " + s1 + ": " + index1);
        
        String s2 = "loveleetcode";
        int index2 = firstUniqChar(s2);
        System.out.println("First unique character index in " + s2 + ": " + index2);
        
        String s3 = "aabb";
        int index3 = firstUniqChar(s3);
        System.out.println("First unique character index in " + s3 + ": " + index3);
    }
}
