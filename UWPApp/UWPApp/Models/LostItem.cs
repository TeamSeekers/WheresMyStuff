using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UWPApp.Models
{
    public class LostItem
    {
        private string name;
        private string color;
        private string description;
        private string address;
        public LostItem() { }
        public LostItem(string name, string color, string description, string address)
        {
            this.name = name;
            this.color = color;
            this.description = description;
            this.address = address;
        }
        public string getDescription()
        {
            return this.description;
        }
        public string getAddress()
        {
            return this.address;
        }
        public string getColor()
        {
            return this.color;
        }
        public string getName()
        {
            return this.name;
        }

    }
}
