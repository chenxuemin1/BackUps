package xiaobaige.Util;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * @图片水印
 * @author xm@c.com    Administrator
 * @date 2018/5/28 0028 下午 3:54
 */
public class Hb_qrcde {

//    public static void main(String[] args) {
//        String srcImgPath = "C://Users//Administrator//Desktop//3.jpg";
//        String iconPath = "C://Users//Administrator//Desktop//QRCODE.jpg";
//        String targerPath = "C://Users//Administrator//Desktop//4.png";
////        String targerPath2 = "C://Users//Administrator//Desktop//4.png";
//// 给图片添加水印
//        Hb_qrcde.markImageByIcon(iconPath, srcImgPath, targerPath);
//// 给图片添加水印,水印旋转-45
////        Hb_qrcde.markImageByIcon(iconPath, srcImgPath, targerPath2,
////                -45);
//
//        String logoText = "小荷才露尖尖角";
//        // 给图片添加水印
//        Hb_qrcde.markByText(logoText, targerPath, targerPath);
//        // 给图片添加水印,水印旋转-45
////        Hb_qrcde.markByText(logoText, targerPath, targerPath, -45);
//    }

    /**
 * 给图片添加水印
 * @param iconPath 水印图片路径
 * @param srcImgPath 源图片路径
 * @param targerPath 目标图片路径
 */
        public static void markImageByIcon(String iconPath, String srcImgPath,
                String targerPath) {
            markImageByIcon(iconPath, srcImgPath, targerPath, null);
        }
/**
 * 给图片添加水印、可设置水印图片旋转角度
 * @param iconPath 水印图片路径
 * @param srcImgPath 源图片路径
 * @param targerPath 目标图片路径
 * @param degree 水印图片旋转角度
 */
        public static void markImageByIcon(String iconPath, String srcImgPath,
                String targerPath, Integer degree) {
            OutputStream os = null;
            try {
                Image srcImg = ImageIO.read(new File(srcImgPath));
                BufferedImage buffImg = new BufferedImage(srcImg.getWidth(null),
                        srcImg.getHeight(null), BufferedImage.TYPE_INT_RGB);
            // 得到画笔对象
            // Graphics g= buffImg.getGraphics();
                Graphics2D g = buffImg.createGraphics();
            // 设置对线段的锯齿状边缘处理
                g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg
                        .getHeight(null), Image.SCALE_SMOOTH), 0, 0, null);
                if (null != degree) {
            // 设置水印旋转
                    g.rotate(Math.toRadians(degree),
                            (double) buffImg.getWidth() / 2, (double) buffImg
                                    .getHeight() / 2);
                }
            // 水印图象的路径 水印一般为gif或者png的，这样可设置透明度
                ImageIcon imgIcon = new ImageIcon(iconPath);
            // 得到Image对象。
                Image img = imgIcon.getImage();
                float alpha = 1f; // 透明度
                g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,
                        alpha));
            // 表示水印图片的位置
                g.drawImage(img, 325, 450, null);
                g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
                g.dispose();
                os = new FileOutputStream(targerPath);
            // 生成图片
                ImageIO.write(buffImg, "JPG", os);
                System.out.println("图片完成添加Icon印章。。。。。。");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != os)
                        os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    /**
     * 给图片添加水印
     * @param logoText
     * @param srcImgPath
     * @param targerPath
     */
    public static void markByText(String logoText, String srcImgPath,
                                String targerPath) {
        markByText(logoText, srcImgPath, targerPath, null);
    }
    /**
     * 给图片添加水印、可设置水印的旋转角度
     * @param logoText
     * @param srcImgPath
     * @param targerPath
     * @param degree
     */
    public static void markByText(String logoText, String srcImgPath,
                                String targerPath, Integer degree) {
        // 主图片的路径
        InputStream is = null;
        OutputStream os = null;
        try {
            Image srcImg = ImageIO.read(new File(srcImgPath));
            BufferedImage buffImg = new BufferedImage(srcImg.getWidth(null),
                    srcImg.getHeight(null), BufferedImage.TYPE_INT_RGB);
        // 得到画笔对象
        // Graphics g= buffImg.getGraphics();
            Graphics2D g = buffImg.createGraphics();
        // 设置对线段的锯齿状边缘处理
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg
                    .getHeight(null), Image.SCALE_SMOOTH), 0, 0, null);
            if (null != degree) {
        // 设置水印旋转
                g.rotate(Math.toRadians(degree),
                        (double) buffImg.getWidth() / 2, (double) buffImg
                                .getHeight() / 2);
            }
        // 设置颜色
            g.setColor(Color.ORANGE);
        // 设置 Font
            g.setFont(new Font("宋体", Font.BOLD, 25));
            float alpha = 1f;
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,
                    alpha));
        // 第一参数->设置的内容，后面两个参数->文字在图片上的坐标位置(x,y) .
            g.drawString(logoText, 240, 1648);
            g.dispose();
            os = new FileOutputStream(targerPath);
        // 生成图片
            ImageIO.write(buffImg, "JPG", os);
            System.out.println("图片完成添加文字印章。。。。。。");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is)
                    is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (null != os)
                    os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
