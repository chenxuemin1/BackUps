package xiaobaige.Service.product.Impl;

import xiaobaige.Dao.product.ClothesDao;
import xiaobaige.Pojo.product.Clothestable;
import xiaobaige.Prop.SystemProperties;
import xiaobaige.Service.product.Clothesservice;
import xiaobaige.Util.FileTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author xm@c.com    Administrator
 * @date 2018/4/13 0013 下午 7:16
 */

@Service
public class ClothesserviceImpl implements Clothesservice {

    @Autowired
    private ClothesDao clothesDao;

    @Autowired
    private SystemProperties system;

    @Override
    public void add(Clothestable clothes,MultipartFile logoFile) {

        try {
            if(!logoFile.isEmpty()) {
                // 上传文件
                String fileName = FileTools.upload(system.getImgUploadDir(), logoFile);
                // 设置 logo url
                clothes.setClothes_img(system.getImgBasePath() + fileName);
            }
            // 保存品牌
            clothesDao.add(clothes);
        } catch (Exception e) {
            throw new RuntimeException("品牌上传失败！");
        }

    }

    @Override
    public void del(int id) {
        clothesDao.del(id);
    }

    @Override
    public void edit(Clothestable clothes,MultipartFile logoFile) {

        try {
            if(!logoFile.isEmpty()) {
                // 上传文件
                String fileName = FileTools.upload(system.getImgUploadDir(), logoFile);
                // 设置 logo url
                clothes.setClothes_img(system.getImgBasePath() + fileName);
            }
            // 保存品牌
            clothesDao.edit(clothes);
        } catch (Exception e) {
            throw new RuntimeException("品牌上传失败！");
        }

    }

    @Override
    public List<Clothestable> findall() {
        return clothesDao.findall();
    }

    @Override
    public List<Clothestable> sel(int id) {
        return clothesDao.sel(id);
    }
}
