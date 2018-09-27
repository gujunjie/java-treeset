package project03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;



public class Text {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Iterator<String> iterator=list.iterator();//迭代器遍历列表
		
		while(iterator.hasNext())
		{
			String s=iterator.next();
			System.out.println(s);
		}
     Map<String,Integer> map=new HashMap<String,Integer>();
     
     map.put("first",1);
     map.put("second",2);
     map.put("third",3);
     
     System.out.println(map.containsKey("second"));//是否包含指定key
     System.out.println(map.containsValue(4));//是否包含指定value
     
     Set<String> set=map.keySet();//获取该图中所有key组成的无序集合
     
     for(String s:set)
     {
    	 System.out.println(map.get(s));//通过key的方式遍历value
     }
     
     List<String> list2=new LinkedList<>();
     
     list2.add("1");
     list2.add("4");
     list2.add("3");
     list2.add("8");
     
     Iterator<String> iterator2=list2.iterator();
     
     while(iterator2.hasNext())
     {
    	 System.out.println(iterator2.next());
     }
     
     System.out.println(list2.get(2));
     
     
     Set<Integer> set2=new HashSet<>();
     set2.add(3);
     set2.add(9);
     set2.add(6);
     set2.add(null);
     
     for(Integer i:set2)
     {
    	 System.out.println(i);
     }
     
     set2.remove(9);
     
     for(Integer i:set2)
     {
    	 System.out.println(i);
     }
     
     
     
     Comparator<Integer> comparator=new Comparator<Integer>() {

		@Override
		public int compare(Integer arg0, Integer arg1) {
			// TODO Auto-generated method stub
			if(arg0<arg1)
			{
				return 1;
			}else if(arg0>arg1)
			{
				return -1;
			}else {
				return 0;
			}
		}
	};
     Set<String> set3=new TreeSet<>();
     
     set3.add("abcd");
     set3.add("grtd");
     set3.add("bdr");
     
     System.out.println(set3);
     
     Map<Integer, String> hashmap=new HashMap<>();
     
     hashmap.put(1,"first");
      
     hashmap.put(2,"second");
     
     hashmap.put(3,"third");
     
     Set<Integer> set4=hashmap.keySet();
     
     
     for(Integer i:set4)
     {
    	 System.out.println(hashmap.get(i));
     }
	}
	
	
	
	
	
	
	
	
	

}
