package codility;

public class BinaryGap {
	
	public static int binaryG(int n) {
	
   		String binaryR=Integer.toBinaryString(n);
		
	char [] ch=binaryR.toCharArray();
	int k=0;
	System.out.println(ch);
	for(int i=0;i<ch.length-1;i++) {
		
		if (ch[i]=='1'&&ch[i+1]=='0') {
			int l=0;
            int c=1;
			for(int j=i+1;j<ch.length-1;j++) {
				if(ch[j]=='1') {

					break;
				}
				if(ch[j]=='0') {
					l++;
                if(j==ch.length-2&&ch[j+1]=='0'){
                    l=0;
                }
				}
				

				
		}
			if(l>k) {
				k=l;
			}
			
	}
	}
	return k;


}
	
	
	public static void main(String[] args)
	{
		System.out.println(BinaryGap.binaryG(15));
		
		
	}

}
