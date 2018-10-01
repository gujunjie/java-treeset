package project03;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Text {

	public static void main(String[] args) {
		
		//自然排序，employee类实现comparable接口，重写compareTo方法，同时也要重写hashcode与equals
		
		Employee employee1=new Employee("aa", 54, new MyDate(4,5, 1997));
		Employee employee2=new Employee("aa", 34, new MyDate(7,4, 1993));
		Employee employee3=new Employee("cc", 64, new MyDate(8,8, 1996));
		Employee employee4=new Employee("dd", 57, new MyDate(3,5, 1992));
		Employee employee5=new Employee("hgf", 23, new MyDate(1,3, 1997));
		
		Set<Employee> set=new TreeSet<>();
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		set.add(employee5);
		
	    for(Employee e:set)
	    {
	    	System.out.println(e.toString());
	    }
	    
	    //定制排序，创建一个实现comparator接口的类，并重写compare方法
	    
	    Comparator< Employee> comparator=new Comparator<Employee>() {

			@Override
			public int compare(Employee arg0, Employee arg1) {
				int i=arg0.getBirthday().getYear()-arg1.getBirthday().getYear();
				if(i!=0)
				{
					return i;
				}else
				{
					int j=arg0.getBirthday().getMonth()-arg1.getBirthday().getMonth();
					if(j!=0)
					{
						return j;
					}else {
						return arg0.getBirthday().getDay()-arg1.getBirthday().getDay();
					}
				}
				
			}
		};
	    
	    Set<Employee> set2=new TreeSet<>(comparator);
	    set2.add(employee1);
		set2.add(employee2);
		set2.add(employee3);
		set2.add(employee4);
		set2.add(employee5);
		
		for(Employee e:set2)
		{
			System.out.println(e.toString());
		}
		
		
		
	}
	

}
