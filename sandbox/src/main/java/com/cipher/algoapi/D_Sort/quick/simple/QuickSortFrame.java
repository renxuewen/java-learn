package com.cipher.algoapi.D_Sort.quick.simple;

import com.cipher.algoapi.A_Base.AlgoFrame;
import com.cipher.algoapi.A_Base.AlgoVisHelper;

/**
 * @Author: CipherCui
 * @Description:
 * @Date: Created in 14:09 2018/9/19
 */
public class QuickSortFrame extends AlgoFrame {

    public QuickSortFrame(String title, int canvasWidth, int canvasHeight) {
        super(title, canvasWidth, canvasHeight);
    }

    @Override
    public void paint(AlgoVisHelper algoVisHelper, Object data) {
        QuickSortData sortData = (QuickSortData) data;
        int w = getCanvasWidth() / sortData.N();
        for (int i = 0; i < sortData.N(); i++) {
            if (i >= sortData.l && i <= sortData.r) {
                algoVisHelper.setColor(AlgoVisHelper.Green);
            } else {
                algoVisHelper.setColor(AlgoVisHelper.Grey);
            }
            if (i == sortData.curPivot) {
                algoVisHelper.setColor(AlgoVisHelper.Indigo);
            }
            if (i == sortData.curElement) {
                algoVisHelper.setColor(AlgoVisHelper.LightBlue);
            }
            if (sortData.fixedPivot[i]) {
                algoVisHelper.setColor(AlgoVisHelper.Red);
            }
            algoVisHelper.fillRectangle(i * w, getCanvasHeight() - sortData.get(i), w - 1, sortData.get(i));
        }
    }

}
