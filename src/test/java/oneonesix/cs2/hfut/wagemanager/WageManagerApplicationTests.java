//package oneonesix.cs2.hfut.wagemanager;
//
//import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.EmployeeEntity;
//import oneonesix.cs2.hfut.wagemanager.mapper.EmployeeMapper;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class WageManagerApplicationTests {
//
//    @Autowired
//    private EmployeeMapper employeeMapper;
//
//    @Test
//    public void testQuery() throws Exception {
//        List<EmployeeEntity> users = employeeMapper.getAll();
//        System.out.println("\n\n");
//        for(EmployeeEntity ee:users){
//            System.out.println(ee.toString()+"  77777");
//        }
////        System.out.println(users.toString());
//        System.out.println("\n\n");
//    }
//
//    @Test
//    public void testInsert() throws Exception{
//        System.out.println("开始插入");
//        for(int i=1;i<10001;i++){
//            employeeMapper.insert(new EmployeeEntity("test"+i,"test"+i));
//            System.out.println("已插入"+i+"条");
//        }
//        System.out.println("插入完成");
//    }
//
//    @Test
//    public void testQueryEmployee()throws Exception{
//        EmployeeEntity employeeEntity = new EmployeeEntity(20180901,"","zhang2");
//        System.out.println("\n\n\n\n\n\n");
//        System.out.println(employeeMapper.queryEmployee(employeeEntity));
//        System.out.println("\n\n\n\n\n\n");
//    }
//
//    @Test
//    public void getAll()throws Exception{
//        EmployeeEntity employeeEntity = new EmployeeEntity(20180901,"","zhang");
//        System.out.println("\n\n\n\n\n\n");
//        System.out.println(employeeMapper.queryEmployee(employeeEntity));
//        System.out.println("\n\n\n\n\n\n");
//    }
//
//}
