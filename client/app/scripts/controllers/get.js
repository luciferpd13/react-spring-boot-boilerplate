'use strict';

angular.module('clientApp')
  .controller('GetCtrl', function ($scope, $http) {
    $scope.data = [];

    $http({
      method: "GET",
      url: "http://localhost:8080/api/notes",
    }).then(function mySuccess(response) {
      $scope.data = response.data;
    }).catch(function(data){
      console.log(data);
    });
    
  });
