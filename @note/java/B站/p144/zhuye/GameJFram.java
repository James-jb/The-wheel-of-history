package zhuye;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.BevelBorder;

// 游戏开始 +主 界面
public class GameJFram extends JFrame implements KeyListener,ActionListener{
    // 创建一个 2维数组
    int[][] date = new int[4][4];
    // 纪录空白方块
    int x = 0;
    int y = 0;
    // 图片路径
    String path = "img\\";
    // 判断胜利
    int[][] win = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0}
    };

            // 下面的条目 对象
            JMenuItem replayItem = new JMenuItem("重开");
            JMenuItem reLoginItem = new JMenuItem("重新登录");
            JMenuItem closeItem = new JMenuItem("关闭游戏");
            JMenuItem accountItem = new JMenuItem("打赏");
    // 主要的方法
    public GameJFram(){
        // 显示界面
        initJFrame();

        // 初始化 * 菜单
        initJMenuBar();

        // 初始化 数据(打乱结果)
        initDate();

        // 初始化 * 图片
        initImage();
        // initImage1();

        // 显示出来
        this.setVisible(true);      
    }
      // 显示 界面效果
    private void initJFrame(){
        // 这是界面的 宽/高
        this.setSize(603, 680);
        // 标题
        this.setTitle("冰果拼图 1.0");
        // 设置界面 置顶
        this.setAlwaysOnTop(true);
        // 设置界面 居中
        this.setLocationRelativeTo(null);
        // 设置 关门模式 (0不关,3关)
        this.setDefaultCloseOperation(3);
        // 取消 ***内置内容
        this.setLayout(null);

        // 给整个界面添加 监听事件
        this.addKeyListener(this);
    }

    // 初始化 * 图片
    private void initImage(){
        // 清除 已有图片
        this.getContentPane().removeAll();

          // 胜利了嘛
          if (victory()){
            // 显示 胜利图标
            JLabel windJLabel = new JLabel(new ImageIcon( path +"win.png"));
            // 图片显示位置
            windJLabel.setBounds(203,283, 10,73);
            this.getContentPane().add(windJLabel);
          }
        // 可以遍历图片
    for(int i=0 ; i<4 ;i++){
        for(int j = 0; j<4 ;j++){
            // 获取当前的图片
            int num = date[i][j];
            JLabel jLabel =new JLabel(new ImageIcon( path + num+".jpg"));
            // 指定图片位置
            jLabel.setBounds( 105*j +83, 105*i +134, 105 , 105);
            //  添加边框
            jLabel.setBorder(new BevelBorder(1));
            // 添加到 界面
            this.getContentPane().add(jLabel);
            // 添加一次自增
        }
    }
     // 背景图片508k*560g    丑
     JLabel backgroud = new JLabel(new ImageIcon( path +"bj.png"));
     backgroud.setBounds(40, 40, 508, 560);
     this.getContentPane().add(backgroud);

    // 刷新 界面
    this.getContentPane().repaint();
    }

    // 初始化 * 菜单
    private void initJMenuBar(){
            // 整个
            JMenuBar jMenuBar  = new JMenuBar();

            // 两个选项
            JMenu functionJMenu = new JMenu("功能");
            JMenu aboutJMenu = new JMenu("打赏我们");
                // 添加事件
            replayItem.addActionListener(this);
            reLoginItem.addActionListener(this);
            closeItem.addActionListener(this);

            accountItem.addActionListener(this);


                // 条目 和 选项 一起
            functionJMenu.add(replayItem);
            functionJMenu.add(reLoginItem);
            functionJMenu.add(closeItem);
            aboutJMenu.add(accountItem);

                // 菜单 和 选项 一起
            jMenuBar.add(functionJMenu);
            jMenuBar.add(aboutJMenu);
  
                // 整个界面显示
            this.setJMenuBar(jMenuBar);
    }

    // 打乱数据
    private void initDate(){
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //  遍历数据 排序
        Random r = new Random();
        for(int i=0 ; i<tempArr.length ; i++){
            // 获取 随机索引
            int index = r.nextInt(tempArr.length);
            // 遍历获取
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        // 第一次 遍历数组
        // for(int i=0;i<tempArr.length;i++){
        //     System.out.println(tempArr[i] + "\t");
        // }
        // System.out.println();
        // // 创建一个 2维数组
        // int[][] date = new int[4][4];

        // 添加数据
        for(int i=0 ; i<tempArr.length ; i++){
            if(tempArr[i] == 0){
                x = i/4;
                y = i%4;
            }
                date[i/4][i%4] = tempArr[i];
            }
        }
        // 第二次 遍历数组
        // for(int i =0 ; i<date.length ; i++){
        //    for(int j=0 ; j<date[i].length ; j++){
        //         System.out.print(date[i][j]);
        //     }
        //     System.err.println();
        // }
       
        //没有写
        @Override
    public void keyTyped(KeyEvent e) {}

        // 按下不松 调用这个方法
        @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            // 删除所有图片
            this.getContentPane().removeAll();

            // 加载 第一张完整图片 位置是哪里呀
            JLabel all = new JLabel(new ImageIcon(path +"all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            // 加载 背景图片
            JLabel backgroud = new JLabel(new ImageIcon(path +"bj.png"));
            backgroud.setBounds(40, 40, 508, 560);
            this.getContentPane().add(backgroud);
            // 刷新界面
            this.getContentPane().repaint();
        }
    }

        @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();
        // System.out.println(code); //打印键盘
        // 判断游戏 是否为胜利
        if(victory()){
            // 结束方法
            return;
        }

        if(code == 37){
            System.out.println("左");
            if(y == 3){
                return;
            }
            date[x][y] = date [x][y+1];
            date[x][y+1] = 0;
            y++;
            // 调用方法 加载
            initImage();

        }else if(code == 38){
            System.out.println("上");
            if(x == 3){
                return;
            }
            // 空白 与 有的 交换
            date[x][y] = date [x+1][y];
            date[x+1][y] = 0;
            x++;
            // 调用方法 加载
            initImage();

        }else if(code == 39){
            System.out.println("右");
            if(y == 0){
                return;
            }

            date[x][y] = date [x][y-1];
            date[x][y-1] = 0;
            y--;
            initImage();

        }else if(code == 40){
            System.out.println("下");
            if(x == 0){
                return;
            }

            date[x][y] = date [x-1][y];
            date[x-1][y] = 0;
            x--;
            // 调用方法 加载
            initImage();
        }else if(code == 65){
            // 查看全部
            initImage();
        }else if(code == 87){
            // 作弊吗
            date = new int[][]{
                {1,2,3,4},
                {5,6,7,8,},
                {9,10,11,12},
                {13,14,15,0}
            };
            initImage();
        }
    }

    // 是否为胜利
    public boolean victory(){
        //  遍历 获得data 比较 对了没有
        for(int i = 0; i<date.length;i++){

            for(int j =0 ;j<date[i].length;i++){
                // 判断 全部一样
                 // date[i][j] = win[i][j];
                if( date[i][j] != win[i][j]){
                    return false;
                }
               
            }
        }
        return true;
    }
    
    // 接口重写
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        // 判断
        if(obj == replayItem){
            System.out.println("重开");
                // 打乱 二维 的数据
                initDate();
                // 加载图片
                initImage();


        }else if(obj == reLoginItem){
            System.out.println("重新登录");
                // 关闭当前界面
                this.setVisible(false);
                // 打开 登录界面
                new loginFrame();

        }else if(obj == closeItem){
            System.out.println("关闭");
            // 退出
            System.exit(0);


        }else if(obj == accountItem){
            System.out.println("打赏");
            
            // 弹框 对象
            JDialog jDialog = new JDialog();
            // 图片显示位置
            JLabel jLabel = new JLabel(new ImageIcon());
            // 位置 宽 高
            jLabel.setBounds(0, 0, 258, 258);
            
            // 图片 添加 弹框
            jDialog.getContentPane().add(jLabel);
            // 弹框的大小
            jDialog.setSize(344, 344);
            // 置顶
            jDialog.setAlwaysOnTop(true);
            // 居中
            jDialog.setLocationRelativeTo(null);
            // 不关闭 无法操作
            jDialog.setModal(true);
            // 弹框 显示出来
            jDialog.setVisible(true);

        }


    }



}
