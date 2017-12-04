package arithmetic.z2.d8;

public class GraphMatrix {

    static final int MaxNum = 20;
    static final int MaxCalue = 65535;
    char[] Vertex = new char[MaxNum];              // 保存顶点信息 序号或字母
    int GType;                                     //图的类型 0 无向图  1 有向图
    int VertexNum;                                  // 顶点数量
    int EdgeNum;                                     // 边的数量
    int[][] EdgeWeight=new int[MaxNum][MaxNum];       // 保存边的权
    int[] isTrav = new int[MaxNum];                  // 遍历标志
}

