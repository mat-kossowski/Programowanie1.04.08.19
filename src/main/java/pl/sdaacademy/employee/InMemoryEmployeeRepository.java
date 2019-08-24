package pl.sdaacademy.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryEmployeeRepository implements EmployeeRepository {




    private List<Employee> employees;


    public InMemoryEmployeeRepository() {
        this.employees = new ArrayList();

        init();
    }

   InMemoryEmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    private void init(){

        employees.add(new Employee("zzz",123,25));
        employees.add(new Employee("vnbvnbv",0,0));
        employees.add(new Employee("JKDFJLKKDSL",12345,24));
        employees.add(new Employee("test0000000000000001",123,23));
        employees.add(new Employee("Bob29",123,23));
        employees.add(new Employee("sdfdsfds",54544,24));
        employees.add(new Employee("rfdsfdsf",9566,24));
        employees.add(new Employee("sdfgdfg",0,24));
        employees.add(new Employee("grfgfdjhnfgj",0,0));
        employees.add(new Employee("zubair12",28765,35));
        employees.add(new Employee("HarryPotter",123,23));
        employees.add(new Employee("vardha",120000,87));
        employees.add(new Employee("ch",0,0));
        employees.add(new Employee("Nupur",500000,26));
        employees.add(new Employee("ch1",0,0));
        employees.add(new Employee("Bob48",123,23));
        employees.add(new Employee("Bob49",12345,23));
        employees.add(new Employee("Bob378",12345,99));
        employees.add(new Employee("HarryPotter1",123,23));
        employees.add(new Employee("HarryPotter2",123,23));
        employees.add(new Employee("harnisha",7878,17));
        employees.add(new Employee("Bob4144",100000,80));
        employees.add(new Employee("Bob4933",10000,23));
        employees.add(new Employee("testjlm",123,23));
        employees.add(new Employee("sadsd",3432,32));
        employees.add(new Employee("kkkk",90888,65));
        employees.add(new Employee("Bob3789",12345,99));
        employees.add(new Employee("abcdefsgxj",373783,46));
        employees.add(new Employee("TestName36",26700,29));
        employees.add(new Employee("TestName37",3200,23));
        employees.add(new Employee("TestName38",2673,25));
        employees.add(new Employee("TestName39",4300,34));
        employees.add(new Employee("kkckck",8383,28));
        employees.add(new Employee("Visu",66666,32));
        employees.add(new Employee("Souvik",2000,30));
        employees.add(new Employee("eewrfewf",689,24));
        employees.add(new Employee("HarryPotter3",123,23));
        employees.add(new Employee("adsfdhnfgj",0,0));
        employees.add(new Employee("abc123",12345,99));
        employees.add(new Employee("namedummyjETI",100456,26));
        employees.add(new Employee("new test",50000,26));
        employees.add(new Employee("abc1234",12345,99));
        employees.add(new Employee("WNTkC7sj1E",7637261,30));
        employees.add(new Employee("nDrfALW7EV",0,30));
        employees.add(new Employee("John111",7637261,30));
        employees.add(new Employee("sfdhnfgj",0,0));
        employees.add(new Employee("dsfsdfs",544445,24));
        employees.add(new Employee("8123945027",2147483647,2147483647));
        employees.add(new Employee("DhNCokLg3A",7637261,30));
        employees.add(new Employee("Sid9rfHCEF",0,30));
        employees.add(new Employee("Y3CuZIwq50",7637261,30));
        employees.add(new Employee("Bob41445",100000,80));
        employees.add(new Employee("jaanu",123456,24));
        employees.add(new Employee("test12assaa33n",12312321,23));
        employees.add(new Employee("test12as22saan",12312321,23));
        employees.add(new Employee("Bob414454",100000,80));
        employees.add(new Employee("testTrainingCD",123,23));
        employees.add(new Employee("Bob4144545",100000,80));
        employees.add(new Employee("abcd123",12345,99));
        employees.add(new Employee("sdfgdggfdgdf",566,24));
        employees.add(new Employee("gvfgfggfg",4142,25));
        employees.add(new Employee("SampleAPItest",12345,30));
        employees.add(new Employee("HarryPotter4",123,23));
        employees.add(new Employee("emp",4142,25));
        employees.add(new Employee("test91357885",123,23));
        employees.add(new Employee("HarryPotter6",123,23));
        employees.add(new Employee("emp0011",4142,25));
        employees.add(new Employee("Sayali",20000,29));
        employees.add(new Employee("abcd1234",12345,99));
        employees.add(new Employee("hgfjhgj",4142,25));
        employees.add(new Employee("Pravin",123,28));
        employees.add(new Employee("vfdxhgfnj",0,0));
        employees.add(new Employee("{itemId}",12345,99));
        employees.add(new Employee("Pravin1",123,28));
        employees.add(new Employee("Pravin2",123,28));
        employees.add(new Employee("Bipin",201,27));
        employees.add(new Employee("Bipin3",2014,274));
        employees.add(new Employee("abcdef123",12345,99));
        employees.add(new Employee("Reportstest",1000,25));
        employees.add(new Employee("test123545454544",123,23));
        employees.add(new Employee("kala",0,24));
        employees.add(new Employee("vg",2,1));
        employees.add(new Employee("wwe",1,1));
        employees.add(new Employee("DINESH",123,23));
        employees.add(new Employee("guru",123,23));
        employees.add(new Employee("wq",12,12));
        employees.add(new Employee("werere",1,1));
        employees.add(new Employee("rey",0,0));
        employees.add(new Employee("ter",12,12));
        employees.add(new Employee("ff",12,12));
        employees.add(new Employee("123",1234,12345));
        employees.add(new Employee("o9ooooo",0,0));
        employees.add(new Employee("hbnjnjm",988488,95));
        employees.add(new Employee("Onur Deneme1",260,26));
        employees.add(new Employee("workshop_test_create6",1000,35));
        employees.add(new Employee("abcdef1234",12345,99));
        employees.add(new Employee("abcdef12345",12345,99));
        employees.add(new Employee("${dummy_name}",12345,99));
        employees.add(new Employee("s",12345,99));
        employees.add(new Employee("Amit Negi111",123456,44));
        employees.add(new Employee("s2",12345,99));
        employees.add(new Employee("test1",123,23));
        employees.add(new Employee("xyz321",12345,99));
        employees.add(new Employee("SSESEVi",85984,54));
        employees.add(new Employee("fhuewiafhiufiuwef2r23",123,23));
        employees.add(new Employee("testssss",41234,23));
        employees.add(new Employee("Bob3790",12345,99));
        employees.add(new Employee("Bob3791",12345,99));
        employees.add(new Employee("xyz3210",12345,99));
        employees.add(new Employee("xyz32101",12345,99));
        employees.add(new Employee("tasdest",12,23));
        employees.add(new Employee("taest",1213,23));
        employees.add(new Employee("MONICA RINCON",4000000,40));
        employees.add(new Employee("dffddffdfd",333333,44));
        employees.add(new Employee("qrshmdhd",2147483647,12));
        employees.add(new Employee("Dagmar",425,32));
        employees.add(new Employee("SpivakHahn",609,680));
        employees.add(new Employee("sinta pai ",12340,31));
        employees.add(new Employee("Jagan",20000,29));
        employees.add(new Employee("Simran",30000,30));
        employees.add(new Employee("abcsdgh",2333,12));
        employees.add(new Employee("rosamel fierro grueso",2147483647,32));
        employees.add(new Employee("llamadaPrimerEndpoint",123456789,23));
        employees.add(new Employee("Uk Prashanth",43465,44));
        employees.add(new Employee("ZywAaBznFj",1271,56));
        employees.add(new Employee("pOQdgAAPkW",1535,37));
        employees.add(new Employee("SiLgFqYHTP",8964,3));
        employees.add(new Employee("QOwwfOdEdP",8997,46));
        employees.add(new Employee("QOwwfOdEdP1",8997,46));
        employees.add(new Employee("AwjuRJbNwL",7393,85));
        employees.add(new Employee("LTSetSPbpY",4666,43));
        employees.add(new Employee("mIDWFpzjMp",4717,40));
        employees.add(new Employee("YldCHtseyw",5713,4));
        employees.add(new Employee("bEfLmuAInv",1362,46));
        employees.add(new Employee("max",123,23));
        employees.add(new Employee("nrwryOcXaq",720,10));
        employees.add(new Employee("pra1",0,0));
        employees.add(new Employee("pra2",20000,25));
        employees.add(new Employee("SAJKLFJLDJGKL",1000,23));
        employees.add(new Employee("DDLlmObIFP",149,78));
        employees.add(new Employee("SAJKLFJLDJGKL1",1000,23));
        employees.add(new Employee("yoh4566yr65657",123,23));
        employees.add(new Employee("hema",12000,21));
        employees.add(new Employee("Saig",61022,56));
        employees.add(new Employee("test121122",123,23));
        employees.add(new Employee("name5",123,23));
        employees.add(new Employee("h8iok",123,23));
        employees.add(new Employee("Bob3792",12345,99));
        employees.add(new Employee("Saiy",24509,18));
        employees.add(new Employee("test121122332",123,23));
        employees.add(new Employee("modify test",1000000,1126));
        employees.add(new Employee("Vinay Singh",75,28));
        employees.add(new Employee("asfa",75,28));
        employees.add(new Employee("dhgjx",75,28));
        employees.add(new Employee("z2nep",75,28));
        employees.add(new Employee("test132421122332",123,23));
        employees.add(new Employee("test13244321122332",123,23));
        employees.add(new Employee("qem9jm",75,28));
        employees.add(new Employee("38rufm",75,28));
        employees.add(new Employee("b1rr29",75,28));
        employees.add(new Employee("16738w",75,28));
        employees.add(new Employee("e0vss",75,28));
        employees.add(new Employee("sinta pais ",12340,31));
        employees.add(new Employee("test88888",123,23));
        employees.add(new Employee("tesdt",123,23));
        employees.add(new Employee("nagarjuna1",855000,31));
        employees.add(new Employee("z4icf",75,28));
        employees.add(new Employee("3gxrhh",75,28));
        employees.add(new Employee("Bob37789",10000,23));
        employees.add(new Employee("dankjesus",420,69));
        employees.add(new Employee("SSESEVj",63578,12));
        employees.add(new Employee("SSESEVO",50167,94));
        employees.add(new Employee("sfgsfd",123,23));
        employees.add(new Employee("test23",123,23));
        employees.add(new Employee("ra",123,23));
        employees.add(new Employee("its me",123,23));
        employees.add(new Employee("guy",123,23));
        employees.add(new Employee("da",1,2));
        employees.add(new Employee("yuh",123,23));
        employees.add(new Employee("ffyh",123,23));
        employees.add(new Employee("Jhon Doe",23456,25));
        employees.add(new Employee("AAA BBB",500,25));
        employees.add(new Employee("morpheus",0,0));
        employees.add(new Employee("Jhon Wick",999999999,30));
        employees.add(new Employee("baz",20,10));
        employees.add(new Employee("Jhon Snow",999999999,30));
        employees.add(new Employee("tyhj",123,23));
        employees.add(new Employee("gh",123,23));
        employees.add(new Employee("hj",123,23));
        employees.add(new Employee("MARCELO LARA",2000000,45));
        employees.add(new Employee("MANUEL JARA",1200000,22));
        employees.add(new Employee("VICTOR RAMA",1000000,33));
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }

    @Override
    public List<Employee> sortByAge() {
        return employees.stream()
                .sorted(Comparator.comparingInt(employees-> employees.getAge()))
                .collect(Collectors.toList());

    }
}
