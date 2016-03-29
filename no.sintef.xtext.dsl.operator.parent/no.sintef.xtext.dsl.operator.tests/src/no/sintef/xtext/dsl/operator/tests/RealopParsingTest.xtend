/*
 * generated by Xtext 2.9.2
 */
package no.sintef.xtext.dsl.operator.tests

import com.google.inject.Inject
import no.sintef.xtext.dsl.operator.realop.Realop
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(RealopInjectorProvider)
class RealopParsingTest{

	@Inject
	ParseHelper<Realop> parseHelper;

	@Test 
	def void testGrammar() {
		val result = parseHelper.parse('''
			operator Name {
				pre : not realised(SPR) or realised(SPR);
				post : postive(SP) and not negative(SPR1) xor negative(SPR);
			}
			
			operator AnotherName {
				pre : realised(SPR);
				post : postive(SP);
			}
		''')
		Assert.assertNotNull(result)
		
		var size = result.operators.size;
		Assert.assertEquals("should be 2 operators", 2, size);
		
		var operator = result.operators.get(0)
		Assert.assertEquals("Name", operator.name);
		
		var pre_condition = operator.exp_post;
		var post_condition = operator.exp_post;
		Assert.assertNotNull(pre_condition);
		Assert.assertNotNull(post_condition);
		
		var rhs = post_condition.rhs;
		Assert.assertNotNull(rhs);
		
		var op = rhs.op;
		Assert.assertEquals(true, op.and);
		Assert.assertEquals(true, rhs.rhs.lhs.negated);
		Assert.assertEquals(true, rhs.rhs.lhs.predicate.negative);
		Assert.assertEquals("SPR1", rhs.rhs.lhs.name);
		
		
	}

}
