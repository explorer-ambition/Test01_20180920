import org.junit.Test;

import java.util.*;


public class TestLambda {
    List<Employee> employees= Arrays.asList(
            new Employee("张三",18,9999.99),
            new Employee("李四",38,5555.55),
            new Employee("王五",50,6666.66),
            new Employee("赵六",16,3333.33),
            new Employee("田七",8,7777.77)
    );
    @Test
    public void test3(){
    List<Employee> list= filterEmployees(employees);
       // List<Employee> emps=new ArrayList<>();
        for(Employee employee:list){
            System.out.println(employee);
            System.out.println("sdfsdf");
        }
    }
    //需求：获取当前公司中员工年龄大于35岁的员工信息

    public List<Employee> filterEmployees(List<Employee> list){
        List<Employee> emps=new ArrayList<>();
        for (Employee employee:emps
             ) {
            if (employee.getAge()>35){
                emps.add(employee);
            }

        }

        return emps;
    }
    @Test
    public void test(){
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return compare(o1,o2);
            }
        };
        TreeSet<Integer> treeSet=new TreeSet<>(comparator);
    }
    //lambda
    @Test
    public void test2(){
        Comparator<Integer> com=(x,y)->Integer.compare(x,y);
        TreeSet<Integer> treeSet=new TreeSet<>(com );
    }
}
