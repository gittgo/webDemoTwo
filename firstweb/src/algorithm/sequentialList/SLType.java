package algorithm.sequentialList;

public class SLType {

    static final int MAXLTN=100;  // 定义顺序表最大长度

    Data[] listData = new Data[MAXLTN];
    int ListLen;    // 顺序表已存节点数量



    // 初始化顺序表
    void SLInit(SLType SL){
        SL.ListLen = 0;
    }

    // 计算顺序表长度
    int SLLength(SLType slType){
        return  slType.ListLen;
    }


    //插入节点
    int SLInsert(SLType slType,int n,Data data){
        int i;
        if(slType.ListLen>=MAXLTN){  //  顺序表节点数量已经超过最大数量
            System.out.println("顺序表节点数量已超过最大数量");
            return 0; // 返回0 表示插入不成功
        }

        if(n<1 || n>slType.ListLen-1){
            System.out.println("插入原始序号错误，不能插入元素！");
            return 0;// 插入不成功
        }

        for (i=slType.ListLen;i >= n;i--){  // 将数据表数据向后移动
            slType.listData[i+1] = slType.listData[i];

        }

        slType.listData[n]=data; // 插入节点
        slType.ListLen++;  // 顺序表节点数量加1
        return 1;        // 插入成功

    }

    // 追加节点
    int SLAdd(SLType slType,Data data){
        if(slType.ListLen>=MAXLTN){
            System.out.println("顺序表已满，不能再添加节点了");
            return 0;
        }
        slType.listData[++slType.ListLen] = data;
        return 1;
    }

    //  删除节点
    int SLDelete(SLType slType,int n){ // 根据序号返回数据元素
        if(n<1||n>slType.ListLen+1){
            System.out.println("删除节点错误！");
            return 0;
        }
        for(int i = n;i<slType.ListLen;i++){
            slType.listData[i] = slType.listData[i+1];
        }
        slType.ListLen--;
        return 1;


    }






}
