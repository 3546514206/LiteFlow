package edu.zjnu;

import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author: 杨海波
 * @date: 2023-02-08 10:29:08
 * @description: todo
 */
public class PreNode extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("pre");
    }
}
