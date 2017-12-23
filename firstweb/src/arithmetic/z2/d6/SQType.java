package arithmetic.z2.d6;

public class SQType {


    static final int QUEUELEN = 15;
    DATA4[] data = new DATA4[QUEUELEN]; // 队列数组
    int head;                           //对头
    int tail;                           //对尾

    // 初始化队列结构
    /**
     * 1 按符号常量QUEUELEN 指定的大小申请一片内存空间，用来保存队列中的数据。
     * 2 设置head=0和tail=0，表示一个空栈。
     */
    SQType SQTypeInit(){
        SQType q;
        if((q = new SQType())!=null){
            q.head = 0;
            q.tail = 0;
            return q;

        }else {
            return null;
        }
    }



    // 判断空队列
    /**
     * 判断空队列即判断一个队列是否为空。如果是空队列，则表示该队列结构中没有数据。
     * 此时可以进行入队列操作。但不可以进行出队列操作。
     */
    int SQTypeIsEmpty(SQType q){
        int temp = 0;
        if(q.head == q.tail){
            temp = 1;
        }
        return (temp);
    }


    // 判断满队列
    /**
     * 判断满队列即判断一个队列结构是否为满。如果是满队列，则表示该队列结构中没有多余的空间来保存数据。
     * 此时不可以进行入队操作，但是可以进行出队列操作。
     */
    int SQTypeIsFull(SQType q){
        int temp = 0;
        if(q.tail == QUEUELEN){
            temp = 1;
        }
        return temp;
    }

    // 清空队列
    /**
     * 清空队列中的所有数据。
     */
    void SQTypeClear(SQType q){
        q.head = 0; // 设置对头
        q.tail = 0;// 设置队尾
    }

    // 释放空间
    /**
     * 释放队列结构所占据的内存单元。
     */
    void SQTypeFree(SQType q){
        if(q!=null){
            q=null;
        }
    }

    // 入队列
    /**
     * 1 首先判断队列顶tail ，如果tail等于QUEUELEN ,则表示溢出，进行出错处理；负责执行以下操作。
     * 2 设置tail = tail+1
     * 3 将入队元素保存到tail指向的位置。
     */
    int InSQType(SQType q,DATA4 data){
        if(q.tail == QUEUELEN){
            System.out.printf("队列已满！操作失败");
            return 0;
        }else {
            q.data[q.tail++] = data;
            return 1;
        }
    }

    // 出队列操作
    /**
     * 1 判断队列head，如果head等于tail，则表示为空队列，进行出错处理；否则执行下面操作。
     * 2 从队列首部取出对头元素。
     * 3 设修改队头head的序号。使其指向后一个元素。
     */
    DATA4 OutSQType(SQType q){
        if(q.head == q.tail){
            System.out.printf("队列已空！操作失败");
        }else {
            return q.data[q.head++];
        }
        return null;
    }


    // 读结点操作
    /**
     * 读取头结点数据 不删除
     */
    DATA4 PeekSQType(SQType q){
        if(this.SQTypeIsEmpty(q)==1){
            System.out.printf("空队列！");
            return null;
        }else {
            return q.data[q.head];
        }
    }

    // 计算队列长度
    /**
     * 统计队列中结点的个数。队尾序号减去对头序号
     */
    int SQTypeLen(SQType q){
        int temp;
        temp = q.tail - q.head;
        return temp;
    }


    //



}
