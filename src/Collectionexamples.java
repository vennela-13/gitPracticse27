import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Collectionexamples {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("vennela");
		list.add("venni");
		list.add("vennela");
		System.out.println(list);
		Set<String> list1=new HashSet<>(list);
		System.out.println(list1);
		list1.stream().forEach(c->System.out.println(c));
		Collections.sort(list);
		System.out.println(list);
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println("element:" + iterator.next());
		}
		Collections.reverse(list);
		System.out.println(list);
		//list.get(1).compareTo("venn");
		System.out.println(list.get(1).compareTo("venni"));
		List<String> list11=Arrays.asList("ve","kl","ve","nh");
		List<String> list13=list11.stream().distinct().collect(Collectors.toList());
		System.out.println(list13);

	}

}
