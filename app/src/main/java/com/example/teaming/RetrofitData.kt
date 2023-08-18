package com.example.teaming

import com.google.gson.annotations.SerializedName
import okhttp3.MultipartBody
import retrofit2.http.Multipart


data class LoginResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: Data
)

data class Data(
    @SerializedName("name")
    val name: String,
    @SerializedName("jwtToken")
    val jwtToken: JwtToken
)

data class JwtToken(
    @SerializedName("grantType")
    val grantType: String,
    @SerializedName("memberId")
    val memberId: Int,
    @SerializedName("accessToken")
    val accessToken: String
)

data class LoginRequset(
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String
)

// 사용자 메인페이지 관련
data class MainPageResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: MainPageData
)

data class MainPageData(
    @SerializedName("memberId")
    val memberId: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("recentlyProject")
    val recentlyProject: List<RecentlyProject>,
    @SerializedName("progressProject")
    val progressProject: List<ProgressProject>,
    @SerializedName("portfolio")
    val portfolio: List<Portfolio>
)

data class RecentlyProject(
    @SerializedName("projectId")
    val projectId: Int,
    @SerializedName("projectName")
    val projectName: String,
    @SerializedName("projectCreatedDate")
    val projectCreatedDate: String,
    @SerializedName("projectStatus")
    val projectStatus: String,
    @SerializedName("projectImage")
    val projectImage: String
)

data class ProgressProject(
    @SerializedName("projectId")
    val projectId: Int,
    @SerializedName("projectName")
    val projectName: String,
    @SerializedName("projectStartDate")
    val projectStartDate: String,
    @SerializedName("projectEndDate")
    val projectEndDate: String,
    @SerializedName("projectImage")
    val projectImage: String,
    @SerializedName("projectStatus")
    val projectStatus: String
)

data class Portfolio(
    @SerializedName("projectId")
    val projectId: Int,
    @SerializedName("projectName")
    val projectName: String,
    @SerializedName("projectStartDate")
    val projectStartDate: String,
    @SerializedName("projectEndDate")
    val projectEndDate: String,
    @SerializedName("projectImage")
    val projectImage: String,
    @SerializedName("projectStatus")
    val projectStatus: String

)

// 사용자 포트폴리오페이지 데이터
data class PortfolioPageResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: PortFolioData
)

data class PortFolioData(
    @SerializedName("memberId")
    val memberId: Int,
    @SerializedName("portfolio")
    val portfolio: List<PortfolioList>
)

data class PortfolioList(
    @SerializedName("projectId")
    val projectId: Int,
    @SerializedName("projectName")
    val projectName: String,
    @SerializedName("projectStartDate")
    val projectStartDate: String,
    @SerializedName("projectEndDate")
    val projectEndDate: String,
    @SerializedName("projectImage")
    val projectImage: String,
    @SerializedName("projectStatus")
    val projectStatus: String
)

// 진행중인 프로젝트 페이지 관련
data class ProgressPageResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: ProgressData
)

data class ProgressData(
    @SerializedName("member_id")
    val member_id: Int,
    @SerializedName("progressProjects")
    val progressProjects: List<PortfolioProgress>
)

data class PortfolioProgress(
    @SerializedName("projectId")
    val projectId: Int,
    @SerializedName("projectName")
    val projectName: String,
    @SerializedName("projectStartDate")
    val projectStartDate: String,
    @SerializedName("projectEndDate")
    val projectEndDate: String,
    @SerializedName("projectImage")
    val projectImage: String,
    @SerializedName("projectStatus")
    val projectStatus: String
)

// 프로젝트 생성
data class CreateProjectResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: CreateData
)

data class CreateData(
    @SerializedName("project_id")
    val project_id: Int
)

data class CreateProjectRequest(
    @SerializedName("project_name")
    val projectName: String,
    @SerializedName("project_image")
    val projectImage: String,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("end_date")
    val endDate: String,
    @SerializedName("project_color")
    val projectColor: String
)

data class ProjectpageResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: ProjectData
)

data class ProjectData(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String?,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("projectStatus")
    val projectStatus: String,
    @SerializedName("memberListDtos")
    val memberList: List<Member>
)

data class Member(
    @SerializedName("member_name")
    val member_name: String,
    @SerializedName("member_image")
    val member_image: String?,
    @SerializedName("email")
    val email: String
)

data class ProjectFilesResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: List<ProjectFileData>
)

data class ProjectFileData(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("filesDetails")
    val filesDetails: List<FileDetails>
)

data class FileDetails(
    @SerializedName("file_type")
    val file_type: String,
    @SerializedName("file_name")
    val file_name: String,
    @SerializedName("file")
    val file: String,
    @SerializedName("comment")
    val comment: Int,
    @SerializedName("file_id")
    val file_id: Int
)



data class MyPageResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: profiledata
)

data class profiledata(
    @SerializedName("memberId")
    val memberId: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("profileImage")
    val profileImage: String?
)

data class SignupResponse(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: String
)

data class MemberRequestDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String
)
