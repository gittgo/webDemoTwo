package src.arithmetic.z2.d7;

import java.util.Scanner;

public class P2_5 {

    static final int MAXLEN = 20;
    static Scanner input = new Scanner(System.in);


    // 初始化二叉树
    /**
     * 首先先申请内存，然后由用户输入一个根结点数据，并将指向左子树和右子树的引用设置为空，完成创建
     */
    CBTType InitTree(){
        CBTType node;
        if((node = new CBTType())!=null){
            System.out.println("请先输入一个根结点数据");
            node.data = input.next();
            node.left = null;
            node.right = null;
            if(node != null){
                return node;
            }else {
                return null;
            }
        }else {
            return null;
        }
    }

    // 添加结点
    /**
     * 添加节点数据时除了要输入结点数据外，还需要指定其父结点，以及添加的结点是作为左子树还是作为右子树。
     */
    void AddTreeNode(CBTType treeNode){
        CBTType pnode,parent;
        String data;
        int menusel;

        if((pnode = new CBTType())!=null){ // 分配内存
            System.out.printf("输入二叉树结点数据");
            pnode.data = input.next();
            pnode.left = null;                  // 设置左右子树为空
            pnode.right = null;

            System.out.printf("输入该结点的父结点数据：");
            data=input.next();

            parent = TreeFindNode(treeNode,data);  // 查找指定数据的结点
            if(parent == null){                     // 如果未找到
                System.out.printf("未找到该父结点！");
                pnode = null;                      // 释放创建的结点内存
                return;
            }

            System.out.printf("1. 添加该结点到左子树；2 添加结点到右子树");

            do {
                menusel=input.nextInt();
                if(menusel ==1 || menusel==2){
                    if (parent == null){
                        System.out.printf("不存在父结点，请先设置父结点@");
                    }else{
                        switch (menusel)
                        {
                            case 1:                         // 添加到左结点
                                if(parent.left!=null){
                                    System.out.printf("左子树结点不为空！");
                                }else{
                                    parent.left = pnode;
                                }
                                break;
                            case 2:                              // 添加到右结点
                                if(parent.right!=null){
                                    System.out.printf("右子树结点不为空！");
                                }else{
                                    parent.right = pnode;
                                }
                                break;
                                default:
                                    System.out.printf("无效参数");

                        }
                    }
                }
            }while (menusel!=1 && menusel!=2);

        }

    }



    // 查找结点
    /**
     * 查找结点即在二叉树的每一个结点中逐个比较数据，当找到目标数据时将返回该数据所在结点的引用。
     */
    CBTType TreeFindNode(CBTType treeNode,String data){
        CBTType ptr;

        if (treeNode==null){
            return null;
        }else{
            if (treeNode.data.equals(data)){
                return treeNode;
            }else{                                          // 分别向左右子树递归查找
                if ((ptr=TreeFindNode(treeNode.left,data))!=null){
                    return ptr;
                }else if((ptr=TreeFindNode(treeNode.right,data))!=null){
                    return ptr;
                }else{
                    return null;
                }
            }
        }
    }

    // 获取左子树
    /**
     * 获取左子树即返回当前结点的左子树结点的值。由于在二叉树结构中定义了相应的引用，方法相对比较简单
     */
    CBTType TreeLeftNode(CBTType treeNode){
        if(treeNode!=null){
            return treeNode.left;
        }else{
            return null;
        }
    }

    // 获取右子树
    CBTType TreeRightNode(CBTType treeNode){
        if(treeNode!=null){
            return treeNode.right;
        }else{
            return null;
        }
    }

    // 判断空树
    /**
     * 判断空树即判断一个二叉树结构是否为空。如果是空树免责表示二叉树结构中没有数据。
     */
    int TreeIsEmpty(CBTType treeNode){
        if(treeNode != null){
            return 0;
        }else {
            return 1;
        }
    }

    // 计算二叉树 深度
    /**
     * 计算二叉树深度即计算二叉树中结点的最大层数，这里需要递归算法来实现计算
     */
    int TreeDepth(CBTType treeNode){
        int depleft,depright;
        if (treeNode == null){
            return 0;
        }else{
            depleft = TreeDepth(treeNode.left);   // 左子树深度(递归)
            depright = TreeDepth(treeNode.right);   // 左子树深度(递归)
            if (depleft>depright){
                return depleft+1;
            }else {
                return depright+1;
            }
        }

    }

    // 清空二叉树
    /**
     * 清空二叉树 即将二叉树变成一个空树，这里也需要使用递归来实现
     */
    void ClearTree(CBTType treeNode){
        if (treeNode != null){
            ClearTree(treeNode.left);
            ClearTree(treeNode.right);
            treeNode = null;                // 释放当前结点所占内存
        }
    }

    //显示结点数据
    /**
     * 显示结点数据 即显示当前结点的数据内容
     */
    void TreeNodeData(CBTType p){
        System.out.printf(p.data);
    }




    // 遍历二叉树
    /**
     * 1 按层遍历算法
     */
    void LevelTree(CBTType treeNode){
        CBTType p;
        CBTType[] q = new CBTType[MAXLEN];         // 定义一个顺序栈
        int head = 0,tail = 0;
        if(treeNode != null){                       //如果队首引用不为空
            tail = (tail+1)%MAXLEN;                      //计算循环队列 对位序号
            q[tail] = treeNode;                     //将二叉树根引用进队
        }
        while (head!=tail){                      //队列不为空  进行循环
            head = (head+1)%MAXLEN;                     //计算循环队列的队首序号
            p = q[head];                     //队首元素
            TreeNodeData(p);                     //处理队首元素
            if(p.left!=null){                     //如果结点存在左子树
                tail = (tail+1)%MAXLEN;                     //计算循环队列的队尾序号
                q[tail] = p.left;                     //将左子树引用入队
            }

            if(p.right!=null){                     // 如果结点存在右子树
                tail = (tail+1)%MAXLEN;                     //计算循环队列的队尾序号
                q[tail] = p.right;                     //将右子树引用入队
            }
        }
    }

    /**
     * 2 先序遍历算法
     */
    /**
     * 先序遍历算法即先按中序遍历左子树，再访问根结点，最后按中序遍历右子树。程序中可以按照递归的思路来遍历整个二叉树。
     */
    void DLRTree(CBTType treeNode){  // 先序遍历
        if(treeNode!=null){
            TreeNodeData(treeNode);// 显示结点的数据
            DLRTree(treeNode.left);
            DLRTree(treeNode.right);
        }
    }

    /**
     * 3 中序遍历
     */
    /**
     * 中序遍历算法即先访问根结点，再按先序遍历左子树，最后按先序遍历右子树。
     */
    void DLRMTree(CBTType treeNode){
        if(treeNode!=null){
            DLRMTree(treeNode.left);
            TreeNodeData(treeNode);    // 显示结点的数据
            DLRMTree(treeNode.right);
        }
    }

    /**
     * 4 后序遍历
     */
    /**
     * 后序遍历算法即先按后序遍历左子树，再按后序遍历右子树，最后访问根结点。
     */
    void DLRHMTree(CBTType treeNode){
        if(treeNode!=null){
            DLRHMTree(treeNode.left);
            DLRHMTree(treeNode.right);
            TreeNodeData(treeNode);    // 显示结点的数据
        }
    }
}
