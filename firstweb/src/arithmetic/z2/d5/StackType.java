package arithmetic.z2.d5;

public class StackType {


    static final int MAXLINE = 50;
    DATA3[] data = new DATA3[MAXLINE]; // 数据元素
    int top;

    // 初始化顺序栈
    /**
     * 首先创建一个空的顺序栈，既初始化顺序栈。顺序栈的初始化操作步骤：
     * 1.按符号常量SIZE指定的大小申请一片内存空间，用来保护栈的数据。
     * 2.设置栈顶引用为0，表示一个空栈。
     */
    StackType SIInit(){
        StackType p ;
        if((p=new StackType())!=null){    // 申请内存
            p.top = 0;                     // 申请成功设置 栈顶
            return p;                   // 返回申请的栈
        }
        return null;                    // 内存申请失败 返回null
    }


    // 判断空栈
    /**
     * 判断空栈即判断一个栈结构是否为空。如果是空栈，则表示该栈结构中没有数据。
     * 可以进行入栈操作，但不能进行出栈操作
     */
    boolean STIsEmpty(StackType s){
        boolean t;
        t=(s.top==0);
        return t;
    }


    // 判断满栈
    /**
     * 判断一个栈结构是否为满。如果是满栈，则表示该栈结构中没有多余的空间来保存额外数据。
     * 此时不可以进行入栈操作，但是可以进行出栈操作。
     */
    boolean STIsFull(StackType s){
        boolean t;
        t=(s.top+1 == MAXLINE);
        return t;
    }

    // 清空栈
    /**
     * 清空栈内所有数据
     */
    void STClear(StackType s){
        s.top = 0;
    }


    // 释放空间
    /**
     * 释放空间即释放栈结构所占用的内存单元。由前面知道，在初始化栈结构时，使用了malloc函数分配空间。
     * 虽然可以使用清空栈操作，但是清空栈操作并没有释放空间，需要使用free函数释放所有空间
     */
    void STFree(StackType s){
        if (s!=null){
            s=null;
        }
    }

    // 入栈
    /**
     * 1 判断栈顶top。如果栈顶+1 大于等于size 说明不能增加
     * 2 设置 top = top+1
     * 3 将入栈元素保存到top位置。
     */
    int PushST(StackType s,DATA3 data){
        if ((s.top+1)>=MAXLINE){
            System.out.printf("栈溢出！");
            return 0;  // 失败
        }
        s.data[++s.top]=data;
        return 1;  // 成功
    }


    // 出栈
    /**
     * 1 判断栈顶top，如果top等于0 表示为空，报错
     * 2 将栈顶引用top所指位置元素返回。
     * 3 设置top=top-1
     */
    DATA3 PopST(StackType s){
        if(s.top==0){
            System.out.printf("栈为空！");
            System.exit(0);
            System.out.printf("关闭后");
        }
        return (s.data[s.top--]);
    }

    // 读结点数据
    /**
     * 读结点数据即取栈结构中结点的数据。由于栈结构的引用。该函数返回值是一个DATA3类读操作。
     */
    DATA3 PeekST(StackType s){
        if(s.top == 0){
            System.out.printf("栈为空！");
            System.exit(0);
        }
        return (s.data[s.top]);
    }


}
