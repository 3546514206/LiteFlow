import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.core.FlowExecutorHolder;
import com.yomahub.liteflow.property.LiteflowConfig;

/**
 * @author: 杨海波
 * @date: 2023-02-08 10:42:09
 * @description: todo
 */
public class Main {

    public static void main(String[] args) {
        LiteflowConfig config = new LiteflowConfig();
        config.setRuleSource("flow.xml");
        FlowExecutor executor = FlowExecutorHolder.loadInstance(config);
        executor.execute2Resp("mychain");
    }
}
