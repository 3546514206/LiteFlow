/**
 * <p>Title: liteflow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2020/4/1
 */
package com.yomahub.liteflow.test.preAndFinally.cmp;

import cn.hutool.core.util.ObjectUtil;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.entity.data.Slot;
import org.springframework.stereotype.Component;

@Component("f3")
public class Finally3Cmp extends NodeComponent {

	@Override
	public void process() throws Exception{
		Slot slot = this.getSlot();
		if (ObjectUtil.isNull(slot.getException())){
			slot.setData("hasEx", false);
		}else{
			slot.setData("hasEx", true);
		}
		System.out.println("Finally3Cmp executed!");
	}
}