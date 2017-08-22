/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/21
 */

/*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-Mybatis.xml"})
public class TestMybatis{
	@Resource
	private User001Mapper user001Mapper;
	public TestMybatis() throws IOException {
	String resource = "spring-Mybatis.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession sqlSession = sqlSessionFactory.openSession();
	User001 user001 =sqlSession.selectOne(user001Mapper.selectByPrimaryKey,1);

	}
}
*/
