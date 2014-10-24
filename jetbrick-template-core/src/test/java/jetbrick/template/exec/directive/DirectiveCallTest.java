package jetbrick.template.exec.directive;

import java.io.IOException;
import jetbrick.template.exec.AbstractJetxSourceTest;
import jetbrick.template.runtime.InterpretException;
import jetbrick.template.runtime.JetTagContext;
import org.junit.Assert;
import org.junit.Test;

public class DirectiveCallTest extends AbstractJetxSourceTest {

    @Test
    public void test() {
        Assert.assertEquals("2", eval("#macro inc(int x)${x+1}#end#call inc(1)"));
    }
}