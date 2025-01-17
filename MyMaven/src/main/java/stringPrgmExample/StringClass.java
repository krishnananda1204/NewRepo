package stringPrgmExample;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		
		StringBuilder sbs=new StringBuilder("World");
		System.out.println(sbs);
		
		//append -to add new string at last
        sb.append("hi");
        System.out.println(sb);
        
        sbs.append("hi");
        System.out.println(sbs);
        
        //insert
        sb.insert(3,"hey");
        System.out.println(sb);
        
        //replace
        sb.replace(1, 3, "java");
        System.out.println(sb);
        sbs.replace(1, 12, "K");
        System.out.println(sbs);
        
        //reverse
        sb.reverse();
        System.out.println(sb);
        
        //delete
        sb.delete(0, 4);
        System.out.println(sb);
	}

}
