using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Xml.Serialization;
using Windows.Storage;
using UWPApp.Models;

namespace UWPApp.Utils
{
    class UserHelper
    {



        private const string USER_ACCOUNT_LIST_FILE_NAME = "userlist.txt";
        private static string _userListPath = Path.Combine(ApplicationData.Current.LocalFolder.Path, USER_ACCOUNT_LIST_FILE_NAME);
        public static List<User> UserList = new List<User>();

        /// Make & save user list file
     
        private static async void SaveUserListAsync()
        {
            string usersXml = SerializeUserListToXml();

            if (File.Exists(_userListPath))
            {
                StorageFile accountsFile = await StorageFile.GetFileFromPathAsync(_userListPath);
                await FileIO.WriteTextAsync(accountsFile, usersXml);
            }
            else
            {
                StorageFile accountsFile = await ApplicationData.Current.LocalFolder.CreateFileAsync(USER_ACCOUNT_LIST_FILE_NAME);
                await FileIO.WriteTextAsync(accountsFile, usersXml);
            }
        }

        /// <summary>

        public static async Task<List<User>> LoadUserListAsync()
        {
            if (File.Exists(_userListPath))
            {
                StorageFile usersFile = await StorageFile.GetFileFromPathAsync(_userListPath);

                string usersXml = await FileIO.ReadTextAsync(usersFile);
                DeserializeXmlToUserList(usersXml);
            }

            return UserList;
        }


        public static string SerializeUserListToXml()
        {
            XmlSerializer xmlizer = new XmlSerializer(typeof(List<User>));
            StringWriter writer = new StringWriter();
            xmlizer.Serialize(writer, UserList);

            return writer.ToString();
        }


        public static List<User> DeserializeXmlToUserList(string listAsXml)
        {
            XmlSerializer xmlizer = new XmlSerializer(typeof(List<User>));
            TextReader textreader = new StreamReader(new MemoryStream(Encoding.UTF8.GetBytes(listAsXml)));

            return UserList = (xmlizer.Deserialize(textreader)) as List<User>;
        }


        //Adding, removing, and validating new users

        public static User AddUser(string username)
        { //Create new user with username, add to local list of users and save, return the user
            User user = new User() { Username = username };
            UserList.Add(user);
            SaveUserListAsync();
            return user;
        }

        public static void RemoveUser(User user)
        {
            //Remove user from list and save
            UserList.Remove(user);
            SaveUserListAsync();
        }

        public static bool ValidateUserCredentials(string username)
        {
            if(string.IsNullOrEmpty(username))
            {
                return false;
            }

            if(!string.Equals(username, "sampleUsername"))
            {
                return false;
            }
            return true;
        }


    }
}
