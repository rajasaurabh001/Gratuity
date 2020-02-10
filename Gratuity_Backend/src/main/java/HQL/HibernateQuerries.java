package HQL;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.ncr.gratuity.model.GratuityList;
@Transactional
public class HibernateQuerries
{
 
	private EntityManager em;
	
	public HibernateQuerries(EntityManager em) 
	{
		super();
		this.em = em;
	}
	public Iterable<GratuityList> getData()
	{
		//List result=em.createNativeQuery("Select * from List"); 
		List result=em.createQuery("from GratuityList").getResultList(); 
		//List result2=em.createNativeQuery("select * from  List ").getResultList();	
		return result;
	}
}
