package edu.zjnu;

import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author: 杨海波
 * @date: 2023-02-08 10:32:12
 * @description: todo
 */
public class AfterNode extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("after");
    }
}
