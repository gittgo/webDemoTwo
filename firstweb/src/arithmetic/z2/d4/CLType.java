package src.arithmetic.z2.d4;

import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;

// 链表
public class CLType {

    DATA2 nodeData = new DATA2();

    CLType nexNode;


    // 追加结点
    // 在链表末尾加一个结点。表尾结点的地址部分保存的是空地址null，
    // 此时需将其设置为新增结点的地址（既远表位结点地址指向新增结点），
    // 然后将新增结点的地址部分设置为null，既新增结点设置成尾。
    CLType ClAddEnd(CLType head, DATA2 nodeData){
        CLType node,htemp;
        if((node=new CLType())==null){
            System.out.println("申请内存失败！");
            return null;
        }else {
            node.nodeData = nodeData;  // 保存数据
            node.nexNode = null;       // 设置结点引用为空，表尾
            if(head == null){           // 头引用
                head = node;
                return head;
            }
            htemp = head;
            while (htemp.nexNode!=null){   // 查找链表表尾
                htemp = htemp.nexNode;
            }
            htemp.nexNode = node;
            return head;
        }
    }


    // 插入头结点
    // 插入头结点即在链表首部添加结点的过程。插入头结点的过程，插入头结点分为三步
    /**
     * 1 分配内存空间，保存新增结点。
     * 2 使新增结点指向head头指向的结点。
     * 3 使头引用head指向新增结点。
     */
    CLType CLAddFirst(CLType head,DATA2 nodeData){
        CLType node;
        if((node = new CLType())==null){
            System.out.printf("申请内存失败！");
            return null;
        }
        else {
            node.nexNode = head.nexNode; // 指向头引用所指的结点
            node.nodeData = nodeData;  // 保存数据
            head.nexNode = node;    // 头引用指向新结点
            return head;
        }
    }



    // 查找结点
    //查找结点就是在链表结构中查找需要的元素。对于链表结构来说，一般可以通过关键字进行查询。
    CLType CLFindNode(CLType head,String key) {   // 查找结点
        CLType htemp;
        htemp = head;
        while (htemp != null){
            if (htemp.nodeData.getKey().equals(key)){
                return htemp;
            }
            htemp = htemp.nexNode;
        }
        return null;
    }

    // 插入结点
    // 插入结点既在链表中间部分的指定位置增加一个节点。
    /**
     * 1 分配内存空间，保存新增的结点。
     * 2 找到插入的逻辑位置，也就是位于哪两个节点之间。
     * 3 修改插入位置结点的引用，使其指向新增结点，而使新增结点指向原插入位置所指向的结点。
     */
    CLType CLInsertNode(CLType head,String findkey,DATA2 nodeData){
        CLType node,nodetemp;
        if((node = new CLType())== null){
            System.out.println("申请内存失败！");
            return null;
        }
        node.nodeData = nodeData;
        nodetemp=CLFindNode(head,findkey);
        if(nodetemp!=null){
            node.nexNode = nodetemp.nexNode;
            nodetemp.nexNode = node;
        }else{
            System.out.printf("未找到指定位置！");
        }
        return head;
    }


    // 删除结点
    // 删除结点就是将链表中的某个结点数据删除。
    /**
     * 1 查找需要删除的结点。
     * 2 使前一结点指向当前结点的下一结点。
     * 3 删除结点。
     */
    int CLDeleteNode(CLType head,String key){
        CLType node,htemp;
        htemp = head;
        node = head;
        while (htemp!=null){
            if(htemp.nodeData.getKey().compareTo(key)==0){
                node.nexNode=htemp.nexNode;
                htemp = null;
                return 1;
            }else {
                node = htemp;
                htemp = htemp.nexNode;
            }
        }
        return 0;
    }


    // 计算链表长度
    // 计算链表长度即统计链表结构中结点的数量。在顺序表中比较方便，但是在链表中。链表结构在物理上不是连续存储的。因此计算链表长度稍复杂。
    int GLLength(CLType head){
        CLType htemp;
        int Len = 0;
        htemp = head;
        while (htemp!=null){
            Len++;
            htemp = htemp.nexNode;
        }
        return Len;
    }

}
