package xiaobaige.Service.product.Impl;

import xiaobaige.Dao.product.ProductDao;
import xiaobaige.Pojo.product.Producttable;
import xiaobaige.Prop.SystemProperties;
import xiaobaige.Service.product.Productservice;
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
public class ProductserviceImpl implements Productservice{

    @Autowired
    private ProductDao productDao;


    @Autowired
    private SystemProperties system;


    @Override
    public void add(Producttable product, MultipartFile logoFile) {

        try {
            if (!logoFile.isEmpty()) {
                // 上传文件
                String fileName = FileTools.upload(system.getImgUploadDir(), logoFile);
                // 设置 logo url
                product.setLogo(system.getImgBasePath() + fileName);
            }
            // 保存品牌
            productDao.add(product);
        } catch (Exception e) {
            throw new RuntimeException("品牌上传失败！");
        }


    }

    @Override
    public void del(int id) {
        productDao.del(id);
    }

    @Override
    public void edit(Producttable product,MultipartFile logoFile) {

        try {
            if(!logoFile.isEmpty()) {
                // 上传文件
                String fileName = FileTools.upload(system.getImgUploadDir(), logoFile);
                // 设置 logo url
                product.setLogo(system.getImgBasePath() + fileName);
            }
            // 保存品牌
            productDao.edit(product);
        } catch (Exception e) {
            throw new RuntimeException("品牌上传失败！");
        }

    }

    @Override
    public List<Producttable> findall() {
        return productDao.findall();
    }

    @Override
    public List<Producttable> sel(int id) {
        return productDao.sel(id);
    }
}
