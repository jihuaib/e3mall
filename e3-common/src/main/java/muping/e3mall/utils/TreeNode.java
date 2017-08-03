package muping.e3mall.utils;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * jquery easyui树形节点树形
 * 节点需要以下树形
 * id 用于异步加载，如果此节点不是叶子节点，当点击时，会向后台发送一个请求（url?id=id）可以用于加载该节点下的子节点
 * text 节点名称
 * state closed-->关闭    open---->打开  一般没有子节点是设置为open   有子节点是设置为closed
 */
@Getter
@Setter
public class TreeNode implements Serializable{
   private Long id;
   private String text;
   private String state;
}
