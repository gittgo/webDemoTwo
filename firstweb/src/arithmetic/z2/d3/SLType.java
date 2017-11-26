package arithmetic.z2.d3;



public class SLType {


    static final int MAXLEN = 100;

    DATA[] ListData = new DATA[MAXLEN];

    int ListLen;


    // 创建一个顺序表
    void SLInit(SLType SL){
        SL.ListLen = 0;
    }

    // 计算顺序表长度
    int SLLength(SLType SL){
        return (SL.ListLen);
    }

    // 插入结点
    // 插入结点就是在线性表L的第i个位置插入一个新的结点，使得其后的结点编号一次加1。插入一个结点后线性表L的长度变为n+1。
    int SLInsert(SLType SL,int n,DATA data){
        int i;
        if(SL.ListLen>=MAXLEN){
            System.out.print("顺序表已满，不能插入结点！");
            return 0;               // 返回0表示插入不成功。
        }
        if(n<1||n>SL.ListLen+1){
            System.out.println("插入元素序号错误，不能插入元素！");
            return 0;
        }
        if(SL.ListLen>0){
            for(i=SL.ListLen;i>=(n-1);i--){
                SL.ListData[i+1] = SL.ListData[i];
            }
        }
        SL.ListData[n-1] = data;
        SL.ListLen++;
        return 1;
    }

    // 追加结点
    // 该方法可以看做是插入结点的一种特殊形式，相当于在顺序表的结尾加一个结点，相对插入结点简单，不必移动大量结点。
    int SLAdd(SLType SL,DATA data){
        if (SL.ListLen>=MAXLEN) {
            System.out.println("SL = " + "数组已经达到最大长度无法添加！");
            return 0;
        }
        SL.ListData[SL.ListLen] = data;
        SL.ListLen++;
        return 1;
    }


    // 删除结点
    // 删除结点既删除线性表L中的第i个结点，使其后的所有编号依次减1；删除结点后线性表的长度会变为n-1
    int SLDelete(SLType SL,int n){
        int i;
        if(n<1||n>SL.ListLen){
            System.out.println("删除结点序号错误，不能删除结点！");
            return 0;
        }
        for (i = n ;i<=SL.ListLen;i++){
            SL.ListData[i-1] = SL.ListData[i];
        }
        SL.ListLen--;
        return 1;
    }


    // 查找结点
    // 对于一个顺序表 序号就是其在数组中的位置 从0开始 查找某个节点就把要查找的数字减一
    DATA SLFindByNum(int n){
        if(n<1||n>this.ListLen){
            System.out.println("查找错误请从新查找！");
            return null;
        }
        return this.ListData[n-1];
    }

    // 关键字查找
    // 按照关键字查找结点。
    DATA SLFindByCont(String key){
        int i;
        for(i=0;i<this.ListLen;i++){
            if(this.ListData[i].getKey().equals(key)){
                return this.ListData[i];
            }
        }
        return null ;
    }

    // 显示所有节点
    // 显示所有节点数据并不是一个数据结构基本的运算，因为其可以简单地逐个引用节点来实现。
    void SLAll(){
        int i ;
        for (i=0;i<this.ListLen;i++) {
            System.out.println("key:" + ListData[i].getKey()+"--name:"+ListData[i].getName()+"--age:"+ListData[i].getAge());
        }
    }








}
