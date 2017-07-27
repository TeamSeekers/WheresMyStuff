using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using UWPApp.Models;

namespace UWPApp.Utils
{
    public class UserList
    {
        private List<User> userList;
        public UserList()
        {
            userList = new List<User>();
        }
        public void addUser(User U)
        {
            userList.Add(U);
        }

    }
}