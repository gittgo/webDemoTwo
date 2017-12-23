package src.arithmetic.z2.d8;

import java.util.Scanner;

public class P2_6 {

    static Scanner input = new Scanner(System.in);

    // 创建邻接矩阵
    static void CreateGraph(GraphMatrix GM){
        int i,j,k;                      //
        int weight;                     //权
        char EstartV,EendV;             //边的起始顶点
        System.out.printf("输入图中各顶点信息");
        for (i=0;i<GM.VertexNum;i++){               // 输入顶点
            System.out.printf("第几个顶点"+(i+1));
            GM.Vertex[i]=(input.next().toCharArray())[0]; // 保存到各顶点的数据元素中
        }
        System.out.printf("输入构成各边的顶点及权值");
        for (k=0;k<GM.EdgeNum;k++){
            System.out.printf("第"+(k+1)+"条边");
            EstartV = input.next().charAt(0);
            EendV = input.next().charAt(0);
            weight = input.nextInt();
            for(i=0;EstartV!=GM.Vertex[i];i++);        // 在已有顶点中查找开始结点
            for(j=0;EendV!=GM.Vertex[j];j++);           // 在已有顶点中查找终结点
            GM.EdgeWeight[i][j]=weight;           // 对应位置保存权值，表示有一条边
            if(GM.GType == 0){
                GM.EdgeWeight[j][i] = weight;    // 在对角位置保存权值
            }
        }
    }



    // 清空矩阵
    static void ClearGraph(GraphMatrix GM){
        int i,j;
        for (i = 0; i <GM.VertexNum ; i++) {
            for (j = 0; j <GM.VertexNum ; j++) {
                GM.EdgeWeight[i][j] = GraphMatrix.MaxCalue;
            }
        }
    }

    // 输出邻接矩阵
    static void OutGraph(GraphMatrix GM){
        int i,j;
        for(j=0;j<GM.VertexNum;j++){
            System.out.printf(GM.Vertex[j]+"");
        }
        System.out.println("");
        for(i=0;i<GM.VertexNum;i++){
            System.out.printf(GM.Vertex[i]+"");
            for(j=0;j<GM.VertexNum;j++){
                if(GM.EdgeWeight[i][j]==GraphMatrix.MaxCalue){
                    System.out.printf("Z");
                }else {
                    System.out.printf(GM.EdgeWeight[i][j]+"");
                }
            }
            System.out.println();
        }
    }
}
