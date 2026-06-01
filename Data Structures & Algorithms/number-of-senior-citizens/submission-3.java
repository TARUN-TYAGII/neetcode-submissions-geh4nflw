class Solution {
    public int countSeniors(String[] details) {
        int count=0;

        for(String str: details){
            int age = Integer.parseInt(str.substring(11,13));
            System.out.print(age);
            if(age>60) count++;
        }
        return count;
    }
}