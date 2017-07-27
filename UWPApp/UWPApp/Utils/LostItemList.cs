using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using UWPApp.Models;
using UWPApp.Utils;

namespace UWPApp.Utils
{
    public class LostItemList
    {
        public List<LostItem> lostItemList;

        public LostItemList()
        {
            lostItemList = new List<LostItem>();
        }
        public void AddItem(LostItem l)
        {
            lostItemList.Add(l);
        }
    }
}
